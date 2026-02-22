# Design Document

## Architecture Overview
- Modular structure: src/dq1/core for game logic, assets/res for resources
- Main components: Game loop, Input, Audio, Battle, Inventory, Player, Enemy, TileMap

## Main Classes
- Game: Core loop and state management
- Player: Player stats, movement, actions
- Enemy: Enemy stats and behavior
- Battle: Combat logic
- Inventory: Item management
- TileMap: World and dungeon layout

## Data Files
- assets/res/inf/*.inf: Items, enemies, spells, player levels, tilesets, texts

## UI
- Java Swing for menus, dialogs, and main game window

## Audio
- Java Sound API for music and effects

## Extensibility
- Easily add new items, enemies, spells via .inf files
- Modular code for adding new features

---
For UML and further technical details, see UML.md.
