import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SortVisualizer extends JFrame {
    private JTextField addText, deleteText, allElementsText;
    private JButton addButton, deleteButton, sortButton, clearButton;
    private JTabbedPane sortingTabbedPane;
    private BubblePanel bubblePanel;
    private SelectionPanel selectionPanel;
    private InsertionPanel insertionPanel;

    private ArrayList<Integer> elements = new ArrayList<>();
    private int[] array;

    public SortVisualizer() {
        setTitle("Sorting Visualizer");
        setSize(1000, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initSouthPanel();
        initCenterPanel();
    }

    private void initSouthPanel() {
        JPanel southPanel = new JPanel();

        addText = new JTextField(10);
        deleteText = new JTextField(10);
        allElementsText = new JTextField();
        allElementsText.setEditable(false);
        allElementsText.setPreferredSize(new Dimension(580, 25));

        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        sortButton = new JButton("Sort");
        clearButton = new JButton("Clear All");

        addButton.addActionListener(e -> {
            try {
                int val = Integer.parseInt(addText.getText());
                elements.add(val);
                updateDisplay();
                repaintAll();
            } catch (NumberFormatException ignored) {}
        });

        deleteButton.addActionListener(e -> {
            try {
                int val = Integer.parseInt(deleteText.getText());
                elements.removeIf(i -> i == val);
                updateDisplay();
                repaintAll();
            } catch (NumberFormatException ignored) {}
        });

        clearButton.addActionListener(e -> {
            elements.clear();
            updateDisplay();
            repaintAll();
        });

        sortButton.addActionListener(e -> {
            array = elements.stream().mapToInt(i -> i).toArray();
            String tab = sortingTabbedPane.getTitleAt(sortingTabbedPane.getSelectedIndex());
            switch (tab) {
                case "Bubble Sort":
                    bubblePanel.sort(array.clone());
                    break;
                case "Selection Sort":
                    selectionPanel.sort(array.clone());
                    break;
                case "Insertion Sort":
                    insertionPanel.sort(array.clone());
                    break;
            }
        });

        southPanel.add(addText);
        southPanel.add(addButton);
        southPanel.add(deleteText);
        southPanel.add(deleteButton);
        southPanel.add(allElementsText);
        southPanel.add(clearButton);
        southPanel.add(sortButton);

        add(southPanel, BorderLayout.SOUTH);
    }

    private void initCenterPanel() {
        sortingTabbedPane = new JTabbedPane();

        bubblePanel = new BubblePanel();
        selectionPanel = new SelectionPanel();
        insertionPanel = new InsertionPanel();

        sortingTabbedPane.addTab("Bubble Sort", bubblePanel);
        sortingTabbedPane.addTab("Selection Sort", selectionPanel);
        sortingTabbedPane.addTab("Insertion Sort", insertionPanel);

        add(sortingTabbedPane, BorderLayout.CENTER);
    }

    private void updateDisplay() {
        allElementsText.setText(elements.toString());
    }

    private void repaintAll() {
        bubblePanel.repaint();
        selectionPanel.repaint();
        insertionPanel.repaint();
    }

    // Abstract base class for panels
    abstract class SortPanel extends JPanel {
        protected int[] arr;

        public SortPanel() {
            setBackground(new Color(0xFEFEFE));
        }

        public void sort(int[] input) {
            this.arr = input;
            new Thread(this::runSort).start();
        }

        abstract void runSort();

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (arr == null) return;
            int width = getWidth();
            int height = getHeight();
            int barWidth = width / arr.length;

            for (int i = 0; i < arr.length; i++) {
                int barHeight = arr[i] * 3;
                g.setColor(Color.BLUE);
                g.fillRect(i * barWidth, height - barHeight, barWidth - 2, barHeight);
            }
        }

        protected void delay() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ignored) {}
        }
    }

    class BubblePanel extends SortPanel {
        @Override
        void runSort() {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                    repaint();
                    delay();
                }
            }
        }
    }

    class SelectionPanel extends SortPanel {
        @Override
        void runSort() {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIdx]) minIdx = j;
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
                repaint();
                delay();
            }
        }
    }

    class InsertionPanel extends SortPanel {
        @Override
        void runSort() {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
                repaint();
                delay();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SortVisualizer app = new SortVisualizer();
            app.setVisible(true);
        });
    }
}
