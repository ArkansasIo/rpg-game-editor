package dq1.editor;

import java.awt.*;
import javax.swing.*;

public class GameEditor extends JFrame {
    public GameEditor() {
        setTitle("Dragon Quest 1 Game Editor");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Main menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Open Project"));
        fileMenu.add(new JMenuItem("Save Project"));
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Game Logic"));
        editMenu.add(new JMenuItem("Audio/Sound"));
        editMenu.add(new JMenuItem("Graphics (PNG)"));
        menuBar.add(editMenu);

        // Plugin menu
        JMenu pluginMenu = new JMenu("Plugins");
        pluginMenu.add(new JMenuItem("Load Plugin"));
        pluginMenu.add(new JMenuItem("Manage Plugins"));
        menuBar.add(pluginMenu);

        setJMenuBar(menuBar);

        // Main panel
        JPanel mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel.add(createFilePanel());
        mainPanel.add(createLogicPanel());
        mainPanel.add(createGraphicsPanel());
        add(mainPanel, BorderLayout.CENTER);
        // TODO: Implement plugin loading and management
    }

    private JPanel createFilePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Files & Folders"));

        // File tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Project Root");
        JTree fileTree = new JTree(root);
        JScrollPane treeScroll = new JScrollPane(fileTree);
        panel.add(treeScroll, BorderLayout.CENTER);

        // Action buttons
        JPanel actionPanel = new JPanel();
        JButton addButton = new JButton("Add File");
        JButton removeButton = new JButton("Remove File");
        JButton editButton = new JButton("Edit File");
        actionPanel.add(addButton);
        actionPanel.add(removeButton);
        actionPanel.add(editButton);
        panel.add(actionPanel, BorderLayout.SOUTH);

        // TODO: Implement file tree loading, add/remove/edit actions

        return panel;
    }

    private JPanel createLogicPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Game Logic"));

        // File selector
        JComboBox<String> fileSelector = new JComboBox<>(new String[] {
            "Animation.java", "Audio.java", "Battle.java", "BitmapFont.java", "Credits.java", "Debug.java", "Dialog.java", "Enemy.java", "Event.java", "EventFactory.java", "Game.java", "Input.java", "Inventory.java", "Item.java", "Magic.java", "OLPresents.java", "Player.java", "PlayerLevel.java", "Resource.java", "Script.java", "Settings.java", "Shop.java", "Spell.java", "Tile.java", "TileMap.java", "Util.java", "View.java"
        });
        panel.add(fileSelector, BorderLayout.NORTH);

        // Source editor
        JTextArea sourceEditor = new JTextArea(20, 30);
        JScrollPane editorScroll = new JScrollPane(sourceEditor);
        panel.add(editorScroll, BorderLayout.CENTER);

        // Action buttons
        JPanel actionPanel = new JPanel();
        JButton loadButton = new JButton("Load");
        JButton saveButton = new JButton("Save");
        actionPanel.add(loadButton);
        actionPanel.add(saveButton);
        panel.add(actionPanel, BorderLayout.SOUTH);

        // TODO: Implement file loading and saving

        return panel;
    }

    private JPanel createGraphicsPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Graphics & Audio"));

        // Audio editor (unchanged)
        JPanel audioPanel = new JPanel(new BorderLayout());
        audioPanel.setBorder(BorderFactory.createTitledBorder("Audio/Sound Editor"));
        JComboBox<String> audioSelector = new JComboBox<>(new String[] {
            "musics.inf", "audio1.wav", "audio2.wav", "audio3.mp3"
        });
        audioPanel.add(audioSelector, BorderLayout.NORTH);
        JPanel audioActions = new JPanel();
        JButton playButton = new JButton("Play");
        JButton stopButton = new JButton("Stop");
        audioActions.add(playButton);
        audioActions.add(stopButton);
        audioPanel.add(audioActions, BorderLayout.SOUTH);

        // Graphics editor
        JPanel graphicsPanel = new JPanel(new BorderLayout());
        graphicsPanel.setBorder(BorderFactory.createTitledBorder("Graphics (PNG) Editor"));
        JComboBox<String> pngSelector = new JComboBox<>(new String[] {
            "tileset.png", "sprite1.png", "sprite2.png"
        });
        graphicsPanel.add(pngSelector, BorderLayout.NORTH);

        // PNG preview
        JLabel previewLabel = new JLabel();
        previewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        previewLabel.setVerticalAlignment(SwingConstants.CENTER);
        previewLabel.setText("PNG Preview Area");
        graphicsPanel.add(previewLabel, BorderLayout.CENTER);

        JButton editPngButton = new JButton("Edit PNG");
        graphicsPanel.add(editPngButton, BorderLayout.SOUTH);

        // TODO: Implement PNG file loading and editing

        panel.add(audioPanel);
        panel.add(graphicsPanel);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameEditor().setVisible(true));
    }
}
