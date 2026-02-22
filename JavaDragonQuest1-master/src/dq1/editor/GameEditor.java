
package dq1.editor;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class GameEditor extends JFrame {

    public GameEditor() {
        setTitle("Dragon Quest 1 Game Editor");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Open Project"));
        fileMenu.add(new JMenuItem("Save Project"));
        fileMenu.add(new JMenuItem("Export"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Undo"));
        editMenu.add(new JMenuItem("Redo"));
        editMenu.addSeparator();
        editMenu.add(new JMenuItem("Game Logic"));
        editMenu.add(new JMenuItem("Audio/Sound"));
        editMenu.add(new JMenuItem("Graphics (PNG)"));
        menuBar.add(editMenu);

        JMenu rpgMenu = new JMenu("RPG Tools");
        JMenuItem enemyEditorItem = new JMenuItem("Enemy Editor");
        enemyEditorItem.addActionListener(e -> showEnemyEditor());
        rpgMenu.add(enemyEditorItem);
        JMenuItem monsterEditorItem = new JMenuItem("Monster Editor");
        monsterEditorItem.addActionListener(e -> showMonsterEditor());
        rpgMenu.add(monsterEditorItem);
        JMenuItem npcEditorItem = new JMenuItem("NPC Editor");
        npcEditorItem.addActionListener(e -> showNPCEditor());
        rpgMenu.add(npcEditorItem);
        JMenuItem characterEditorItem = new JMenuItem("Character Editor");
        characterEditorItem.addActionListener(e -> showCharacterEditor());
        rpgMenu.add(characterEditorItem);
        JMenuItem weaponEditorItem = new JMenuItem("Weapon Editor");
        weaponEditorItem.addActionListener(e -> showWeaponEditor());
        rpgMenu.add(weaponEditorItem);
        JMenuItem armorEditorItem = new JMenuItem("Armor Editor");
        armorEditorItem.addActionListener(e -> showArmorEditor());
        rpgMenu.add(armorEditorItem);
        JMenuItem itemEditorItem = new JMenuItem("Item Editor");
        itemEditorItem.addActionListener(e -> showItemEditor());
        rpgMenu.add(itemEditorItem);
        JMenuItem zoneEditorItem = new JMenuItem("Zone Editor");
        zoneEditorItem.addActionListener(e -> showZoneEditor());
        rpgMenu.add(zoneEditorItem);
        JMenuItem subZoneEditorItem = new JMenuItem("Sub-Zone Editor");
        subZoneEditorItem.addActionListener(e -> showSubZoneEditor());
        rpgMenu.add(subZoneEditorItem);
        JMenuItem mapEditorItem = new JMenuItem("Map Editor");
        mapEditorItem.addActionListener(e -> showMapEditor());
        rpgMenu.add(mapEditorItem);
        JMenuItem scriptEditorItem = new JMenuItem("Script Editor");
        scriptEditorItem.addActionListener(e -> showScriptEditor());
        rpgMenu.add(scriptEditorItem);
        rpgMenu.add(new JMenuItem("Event Editor"));
        rpgMenu.add(new JMenuItem("Player Editor"));
        menuBar.add(rpgMenu);

        // Data Tools menu
        JMenu dataMenu = new JMenu("Data Tools");
        JMenuItem sqlEditorItem = new JMenuItem("SQL Editor");
        sqlEditorItem.addActionListener(e -> showSQLEditor());
        dataMenu.add(sqlEditorItem);
        JMenuItem excelEditorItem = new JMenuItem("Excel Editor");
        excelEditorItem.addActionListener(e -> showExcelEditor());
        dataMenu.add(excelEditorItem);
        menuBar.add(dataMenu);

        // IO Menu
        JMenu ioMenu = new JMenu("IO Tools");
        ioMenu.add(new JMenuItem("Import Data"));
        ioMenu.add(new JMenuItem("Export Data"));
        ioMenu.add(new JMenuItem("Batch Tools"));

        // Command Menu
        JMenu commandMenu = new JMenu("Command");
        commandMenu.add(new JMenuItem("Run Game"));
        commandMenu.add(new JMenuItem("Build Project"));
        commandMenu.add(new JMenuItem("Test Game"));

        // Widget Menu
        JMenu widgetMenu = new JMenu("Widgets");
        widgetMenu.add(new JMenuItem("Tile Picker"));
        // ...existing code for other UI setup...
    }

    // SQL Editor dialog
            setJMenuBar(menuBar);
        
            JPanel mainPanel = new JPanel(new GridLayout(1, 3));
            mainPanel.add(createFilePanel());
            mainPanel.add(createLogicPanel());
            mainPanel.add(createGraphicsPanel());
            add(mainPanel, BorderLayout.CENTER);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

    // Excel Editor dialog
    private void showExcelEditor() {
        JDialog dialog = new JDialog((Frame)this, "Excel Editor", true);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit RPG data in spreadsheet format."), BorderLayout.NORTH);
        JTable excelTable = new JTable(
            new Object[][] {
                {"Name", "Type", "Value"},
                {"Potion", "Item", 50},
                {"Sword", "Weapon", 200},
                {"Dragon", "Monster", 1000}
            },
            new Object[] {"Name", "Type", "Value"}
        );
        panel.add(new JScrollPane(excelTable), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save Spreadsheet");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

    // ...existing code for other dialogs and editor features...
    private void showSubZoneEditor() {
        JDialog dialog = new JDialog((Frame)this, "Sub-Zone Editor", true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit sub-zone properties here."), BorderLayout.NORTH);
        JTextArea subZoneArea = new JTextArea(10, 30);
        subZoneArea.setText("Sub-Zone Name: \nParent Zone: \nType: \nDifficulty: \nMap: \n");
        panel.add(new JScrollPane(subZoneArea), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }


                JMenu pluginMenu = new JMenu("Plugins");
                pluginMenu.add(new JMenuItem("Load Plugin"));
                pluginMenu.add(new JMenuItem("Manage Plugins"));
                menuBar.add(pluginMenu);

                setJMenuBar(menuBar);

                JPanel mainPanel = new JPanel(new GridLayout(1, 3));
                mainPanel.add(createFilePanel());
                mainPanel.add(createLogicPanel());
                mainPanel.add(createGraphicsPanel());
                add(mainPanel, BorderLayout.CENTER);
            }

            // Dialog methods
            private void showEnemyEditor() {
                JDialog dialog = new JDialog((Frame)this, "Enemy Editor", true);
                dialog.setSize(400, 300);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit enemy stats and properties here."), BorderLayout.NORTH);
                JTextArea enemyArea = new JTextArea(10, 30);
                enemyArea.setText("Name: \nHP: \nAttack: \nDefense: \nSpecial: \n");
                panel.add(new JScrollPane(enemyArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            private void showItemEditor() {
                JDialog dialog = new JDialog((Frame)this, "Item Editor", true);
                dialog.setSize(400, 300);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit item properties here."), BorderLayout.NORTH);
                JTextArea itemArea = new JTextArea(10, 30);
                itemArea.setText("Name: \nType: \nEffect: \nValue: \nSpecial: \n");
                panel.add(new JScrollPane(itemArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            private void showMapEditor() {
                JDialog dialog = new JDialog((Frame)this, "Map Editor", true);
                dialog.setSize(500, 350);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit map layout and properties here."), BorderLayout.NORTH);
                JTextArea mapArea = new JTextArea(12, 40);
                mapArea.setText("Map Name: \nWidth: \nHeight: \nTiles: \nEvents: \n");
                panel.add(new JScrollPane(mapArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            private void showScriptEditor() {
                JDialog dialog = new JDialog((Frame)this, "Script Editor", true);
                dialog.setSize(500, 350);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit game scripts here."), BorderLayout.NORTH);
                JTextArea scriptArea = new JTextArea(12, 40);
                scriptArea.setText("Script Name: \nScript Content: \n");
                panel.add(new JScrollPane(scriptArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            // Panel methods
            private JPanel createFilePanel() {
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createTitledBorder("Files & Folders"));
                DefaultMutableTreeNode root = new DefaultMutableTreeNode("Project Root");
                JTree fileTree = new JTree(root);
                JScrollPane treeScroll = new JScrollPane(fileTree);
                panel.add(treeScroll, BorderLayout.CENTER);
                JPanel actionPanel = new JPanel();
                JButton addButton = new JButton("Add File");
                JButton removeButton = new JButton("Remove File");
                JButton editButton = new JButton("Edit File");
                actionPanel.add(addButton);
                actionPanel.add(removeButton);
                actionPanel.add(editButton);
                panel.add(actionPanel, BorderLayout.SOUTH);
                return panel;
            }

            private JPanel createLogicPanel() {
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createTitledBorder("Game Logic"));
                JComboBox<String> fileSelector = new JComboBox<>(new String[] {
                    "Animation.java", "Audio.java", "Battle.java", "BitmapFont.java", "Credits.java", "Debug.java", "Dialog.java", "Enemy.java", "Event.java", "EventFactory.java", "Game.java", "Input.java", "Inventory.java", "Item.java", "Magic.java", "OLPresents.java", "Player.java", "PlayerLevel.java", "Resource.java", "Script.java", "Settings.java", "Shop.java", "Spell.java", "Tile.java", "TileMap.java", "Util.java", "View.java"
                });
                panel.add(fileSelector, BorderLayout.NORTH);
                JTextArea sourceEditor = new JTextArea(20, 30);
                JScrollPane editorScroll = new JScrollPane(sourceEditor);
                panel.add(editorScroll, BorderLayout.CENTER);
                JPanel actionPanel = new JPanel();
                JButton loadButton = new JButton("Load");
                JButton saveButton = new JButton("Save");
                actionPanel.add(loadButton);
                actionPanel.add(saveButton);
                panel.add(actionPanel, BorderLayout.SOUTH);
                return panel;
            }

            private JPanel createGraphicsPanel() {
                JPanel panel = new JPanel(new GridLayout(2, 1));
                panel.setBorder(BorderFactory.createTitledBorder("Graphics & Audio"));
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
                JPanel graphicsPanel = new JPanel(new BorderLayout());
                graphicsPanel.setBorder(BorderFactory.createTitledBorder("Graphics (PNG) Editor"));
                JComboBox<String> pngSelector = new JComboBox<>(new String[] {
                    "tileset.png", "sprite1.png", "sprite2.png"
                });
                graphicsPanel.add(pngSelector, BorderLayout.NORTH);
                JLabel previewLabel = new JLabel("PNG Preview Area", SwingConstants.CENTER);
                graphicsPanel.add(previewLabel, BorderLayout.CENTER);
                JButton editPngButton = new JButton("Edit PNG");
                graphicsPanel.add(editPngButton, BorderLayout.SOUTH);
                panel.add(audioPanel);
                panel.add(graphicsPanel);
                return panel;
            }

            public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> new GameEditor().setVisible(true));
            }
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
    // (Removed stray dialog code outside constructor)

    // Example: Basic Script Editor dialog
    private void showScriptEditor() {
        JDialog dialog = new JDialog(this, "Script Editor", true);
        dialog.setSize(500, 350);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit game scripts here."), BorderLayout.NORTH);
        JTextArea scriptArea = new JTextArea(12, 40);
        scriptArea.setText("Script Name: \nScript Content: \n");
        panel.add(new JScrollPane(scriptArea), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

        // Input/Output menu
        JMenu ioMenu = new JMenu("Input/Output");
        ioMenu.add(new JMenuItem("Import Data"));
        // Commands menu
        JMenu commandMenu = new JMenu("Commands");
        commandMenu.add(new JMenuItem("Run Game"));
        commandMenu.add(new JMenuItem("Build Project"));
        commandMenu.add(new JMenuItem("Test Game"));
        menuBar.add(commandMenu);

        // Widgets menu
        JMenu widgetMenu = new JMenu("Widgets");
        widgetMenu.add(new JMenuItem("Tile Picker"));
        widgetMenu.add(new JMenuItem("Color Palette"));
        widgetMenu.add(new JMenuItem("Sound Mixer"));
        widgetMenu.add(new JMenuItem("Sprite Viewer"));
        menuBar.add(widgetMenu);

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

    public GameEditor() {
        setTitle("Dragon Quest 1 Game Editor");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Open Project"));
        fileMenu.add(new JMenuItem("Save Project"));
        fileMenu.add(new JMenuItem("Export"));
        fileMenu.add(new JMenuItem("Import"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Undo"));
        editMenu.add(new JMenuItem("Redo"));
        editMenu.addSeparator();
        editMenu.add(new JMenuItem("Game Logic"));
        editMenu.add(new JMenuItem("Audio/Sound"));
        editMenu.add(new JMenuItem("Graphics (PNG)"));
        menuBar.add(editMenu);

        JMenu rpgMenu = new JMenu("RPG Tools");
        JMenuItem enemyEditorItem = new JMenuItem("Enemy Editor");
        enemyEditorItem.addActionListener(e -> showEnemyEditor());
        rpgMenu.add(enemyEditorItem);
        JMenuItem itemEditorItem = new JMenuItem("Item Editor");
        itemEditorItem.addActionListener(e -> showItemEditor());
        rpgMenu.add(itemEditorItem);
        JMenuItem mapEditorItem = new JMenuItem("Map Editor");
            // Dialog methods
            private void showEnemyEditor() {
                JDialog dialog = new JDialog((Frame)this, "Enemy Editor", true);
                dialog.setSize(400, 300);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit enemy stats and properties here."), BorderLayout.NORTH);
                JTextArea enemyArea = new JTextArea(10, 30);
                enemyArea.setText("Name: \nHP: \nAttack: \nDefense: \nSpecial: \n");
                panel.add(new JScrollPane(enemyArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            private void showItemEditor() {
                JDialog dialog = new JDialog((Frame)this, "Item Editor", true);
                dialog.setSize(400, 300);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit item properties here."), BorderLayout.NORTH);
                JTextArea itemArea = new JTextArea(10, 30);
                itemArea.setText("Name: \nType: \nEffect: \nValue: \nSpecial: \n");
                panel.add(new JScrollPane(itemArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            private void showMapEditor() {
                JDialog dialog = new JDialog((Frame)this, "Map Editor", true);
                dialog.setSize(500, 350);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit map layout and properties here."), BorderLayout.NORTH);
                JTextArea mapArea = new JTextArea(12, 40);
                mapArea.setText("Map Name: \nWidth: \nHeight: \nTiles: \nEvents: \n");
                panel.add(new JScrollPane(mapArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            private void showScriptEditor() {
                JDialog dialog = new JDialog((Frame)this, "Script Editor", true);
                dialog.setSize(500, 350);
                dialog.setLocationRelativeTo(this);
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                panel.add(new JLabel("Edit game scripts here."), BorderLayout.NORTH);
                JTextArea scriptArea = new JTextArea(12, 40);
                scriptArea.setText("Script Name: \nScript Content: \n");
                panel.add(new JScrollPane(scriptArea), BorderLayout.CENTER);
                JButton saveButton = new JButton("Save");
                panel.add(saveButton, BorderLayout.SOUTH);
                dialog.setContentPane(panel);
                dialog.setVisible(true);
            }

            // Panel methods
            private JPanel createFilePanel() {
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createTitledBorder("Files & Folders"));
                DefaultMutableTreeNode root = new DefaultMutableTreeNode("Project Root");
                JTree fileTree = new JTree(root);
                JScrollPane treeScroll = new JScrollPane(fileTree);
                panel.add(treeScroll, BorderLayout.CENTER);
                JPanel actionPanel = new JPanel();
                JButton addButton = new JButton("Add File");
                JButton removeButton = new JButton("Remove File");
                JButton editButton = new JButton("Edit File");
                actionPanel.add(addButton);
                actionPanel.add(removeButton);
                actionPanel.add(editButton);
                panel.add(actionPanel, BorderLayout.SOUTH);
                return panel;
            }

            private JPanel createLogicPanel() {
                JPanel panel = new JPanel(new BorderLayout());
                panel.setBorder(BorderFactory.createTitledBorder("Game Logic"));
                JComboBox<String> fileSelector = new JComboBox<>(new String[] {
                    "Animation.java", "Audio.java", "Battle.java", "BitmapFont.java", "Credits.java", "Debug.java", "Dialog.java", "Enemy.java", "Event.java", "EventFactory.java", "Game.java", "Input.java", "Inventory.java", "Item.java", "Magic.java", "OLPresents.java", "Player.java", "PlayerLevel.java", "Resource.java", "Script.java", "Settings.java", "Shop.java", "Spell.java", "Tile.java", "TileMap.java", "Util.java", "View.java"
                });
                panel.add(fileSelector, BorderLayout.NORTH);
                JTextArea sourceEditor = new JTextArea(20, 30);
                JScrollPane editorScroll = new JScrollPane(sourceEditor);
                panel.add(editorScroll, BorderLayout.CENTER);
                JPanel actionPanel = new JPanel();
                JButton loadButton = new JButton("Load");
                JButton saveButton = new JButton("Save");
                actionPanel.add(loadButton);
                actionPanel.add(saveButton);
                panel.add(actionPanel, BorderLayout.SOUTH);
                return panel;
            }

            private JPanel createGraphicsPanel() {
                JPanel panel = new JPanel(new GridLayout(2, 1));
                panel.setBorder(BorderFactory.createTitledBorder("Graphics & Audio"));
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
                JPanel graphicsPanel = new JPanel(new BorderLayout());
                graphicsPanel.setBorder(BorderFactory.createTitledBorder("Graphics (PNG) Editor"));
                JComboBox<String> pngSelector = new JComboBox<>(new String[] {
                    "tileset.png", "sprite1.png", "sprite2.png"
                });
                graphicsPanel.add(pngSelector, BorderLayout.NORTH);
                JLabel previewLabel = new JLabel("PNG Preview Area", SwingConstants.CENTER);
                graphicsPanel.add(previewLabel, BorderLayout.CENTER);
                JButton editPngButton = new JButton("Edit PNG");
                graphicsPanel.add(editPngButton, BorderLayout.SOUTH);
                panel.add(audioPanel);
                panel.add(graphicsPanel);
                return panel;
            }

            public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> new GameEditor().setVisible(true));
            }
        mapEditorItem.addActionListener(e -> showMapEditor());
        rpgMenu.add(mapEditorItem);
        JMenuItem scriptEditorItem = new JMenuItem("Script Editor");
        scriptEditorItem.addActionListener(e -> showScriptEditor());
        rpgMenu.add(scriptEditorItem);
        rpgMenu.add(new JMenuItem("Event Editor"));
        rpgMenu.add(new JMenuItem("Player Editor"));
        menuBar.add(rpgMenu);

        JMenu ioMenu = new JMenu("Input/Output");
        ioMenu.add(new JMenuItem("Import Data"));
        ioMenu.add(new JMenuItem("Export Data"));
        ioMenu.add(new JMenuItem("Batch Tools"));
        menuBar.add(ioMenu);

        JMenu commandMenu = new JMenu("Commands");
        commandMenu.add(new JMenuItem("Run Game"));
        commandMenu.add(new JMenuItem("Build Project"));
        commandMenu.add(new JMenuItem("Test Game"));
        menuBar.add(commandMenu);

        JMenu widgetMenu = new JMenu("Widgets");
        widgetMenu.add(new JMenuItem("Tile Picker"));
        widgetMenu.add(new JMenuItem("Color Palette"));
        widgetMenu.add(new JMenuItem("Sound Mixer"));
        widgetMenu.add(new JMenuItem("Sprite Viewer"));
        menuBar.add(widgetMenu);

        JMenu pluginMenu = new JMenu("Plugins");
        pluginMenu.add(new JMenuItem("Load Plugin"));
        pluginMenu.add(new JMenuItem("Manage Plugins"));
        menuBar.add(pluginMenu);

        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel.add(createFilePanel());
        mainPanel.add(createLogicPanel());
        mainPanel.add(createGraphicsPanel());
        add(mainPanel, BorderLayout.CENTER);
        // TODO: Implement plugin loading and management
    }

    // Editor dialog methods
    private void showEnemyEditor() {
        JDialog dialog = new JDialog(this, "Enemy Editor", true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit enemy stats and properties here."), BorderLayout.NORTH);
        JTextArea enemyArea = new JTextArea(10, 30);
        enemyArea.setText("Name: \nHP: \nAttack: \nDefense: \nSpecial: \n");
        panel.add(new JScrollPane(enemyArea), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

    private void showItemEditor() {
        JDialog dialog = new JDialog(this, "Item Editor", true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit item properties here."), BorderLayout.NORTH);
        JTextArea itemArea = new JTextArea(10, 30);
        itemArea.setText("Name: \nType: \nEffect: \nValue: \nSpecial: \n");
        panel.add(new JScrollPane(itemArea), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

    private void showMapEditor() {
        JDialog dialog = new JDialog(this, "Map Editor", true);
        dialog.setSize(500, 350);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit map layout and properties here."), BorderLayout.NORTH);
        JTextArea mapArea = new JTextArea(12, 40);
        mapArea.setText("Map Name: \nWidth: \nHeight: \nTiles: \nEvents: \n");
        panel.add(new JScrollPane(mapArea), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

    private void showScriptEditor() {
        JDialog dialog = new JDialog(this, "Script Editor", true);
        dialog.setSize(500, 350);
        dialog.setLocationRelativeTo(this);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Edit game scripts here."), BorderLayout.NORTH);
        JTextArea scriptArea = new JTextArea(12, 40);
        scriptArea.setText("Script Name: \nScript Content: \n");
        panel.add(new JScrollPane(scriptArea), BorderLayout.CENTER);
        JButton saveButton = new JButton("Save");
        panel.add(saveButton, BorderLayout.SOUTH);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }

    private JPanel createFilePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Files & Folders"));
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Project Root");
        JTree fileTree = new JTree(root);
        JScrollPane treeScroll = new JScrollPane(fileTree);
        panel.add(treeScroll, BorderLayout.CENTER);
        JPanel actionPanel = new JPanel();
        JButton addButton = new JButton("Add File");
        JButton removeButton = new JButton("Remove File");
        JButton editButton = new JButton("Edit File");
        actionPanel.add(addButton);
        actionPanel.add(removeButton);
        actionPanel.add(editButton);
        panel.add(actionPanel, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createLogicPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Game Logic"));
        JComboBox<String> fileSelector = new JComboBox<>(new String[] {
            "Animation.java", "Audio.java", "Battle.java", "BitmapFont.java", "Credits.java", "Debug.java", "Dialog.java", "Enemy.java", "Event.java", "EventFactory.java", "Game.java", "Input.java", "Inventory.java", "Item.java", "Magic.java", "OLPresents.java", "Player.java", "PlayerLevel.java", "Resource.java", "Script.java", "Settings.java", "Shop.java", "Spell.java", "Tile.java", "TileMap.java", "Util.java", "View.java"
        });
        panel.add(fileSelector, BorderLayout.NORTH);
        JTextArea sourceEditor = new JTextArea(20, 30);
        JScrollPane editorScroll = new JScrollPane(sourceEditor);
        panel.add(editorScroll, BorderLayout.CENTER);
        JPanel actionPanel = new JPanel();
        JButton loadButton = new JButton("Load");
        JButton saveButton = new JButton("Save");
        actionPanel.add(loadButton);
        actionPanel.add(saveButton);
        panel.add(actionPanel, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createGraphicsPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Graphics & Audio"));
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
        JPanel graphicsPanel = new JPanel(new BorderLayout());
        graphicsPanel.setBorder(BorderFactory.createTitledBorder("Graphics (PNG) Editor"));
        JComboBox<String> pngSelector = new JComboBox<>(new String[] {
            "tileset.png", "sprite1.png", "sprite2.png"
        });
        graphicsPanel.add(pngSelector, BorderLayout.NORTH);
        JLabel previewLabel = new JLabel();
        previewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        previewLabel.setVerticalAlignment(SwingConstants.CENTER);
        previewLabel.setText("PNG Preview Area");
        graphicsPanel.add(previewLabel, BorderLayout.CENTER);
        JButton editPngButton = new JButton("Edit PNG");
        graphicsPanel.add(editPngButton, BorderLayout.SOUTH);
        panel.add(audioPanel);
        panel.add(graphicsPanel);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameEditor().setVisible(true));
    }
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
