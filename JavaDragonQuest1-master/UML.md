# UML Documentation

## Main Class Diagram

```mermaid
graph TD
    Game --> Player
    Game --> Enemy
    Game --> Battle
    Game --> Inventory
    Game --> TileMap
    Player --> Inventory
    Enemy --> Battle
    Battle --> Player
    Battle --> Enemy
    Inventory --> Item
    TileMap --> Tile
```

## Description
- **Game**: Central controller, manages state and flow
- **Player**: Player character, stats, inventory
- **Enemy**: Monster stats and behavior
- **Battle**: Handles combat between player and enemy
- **Inventory**: Manages items
- **TileMap**: World and dungeon layout
- **Item**: Usable objects
- **Tile**: Map tiles

---
For more details, see Design.md and GDD.md.
