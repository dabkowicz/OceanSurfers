# OceanSurfers

OceanSurfers is a simple endless-runner style Android game inspired by games such as Subway Surfers, but set in an underwater environment.

The player controls a fish using the device's gyroscope and must avoid incoming obstacles while collecting points and surviving for as long as possible.

This project focuses primarily on game logic, gyroscope-based movement, collision detection, and real-time rendering using Android Studio and Java.

---

## Gameplay

- Control the fish by tilting your phone left and right.
- Avoid sharks and rocks appearing on the underwater path.
- Survive as long as possible.
- Increase your score over time.
- Speed increases as the game progresses.
- Colliding with an obstacle results in a Game Over screen.

---

## Features

### Gyroscope Control

The player's movement is controlled entirely by the phone's gyroscope.

Features:
- Smooth left/right movement
- Real-time sensor input
- Responsive gameplay

---

### Player Character

- Play as an underwater fish.
- Dynamic movement across multiple lanes.
- Screen-space collision system.

---

### Obstacles

The game currently contains:

#### Shark
- Moving obstacle
- Scales with perspective
- Collision enabled

#### Rock
- Moving obstacle
- Scales with perspective
- Collision enabled

---

### Pseudo 3D Perspective

To create a feeling of movement through the ocean, the game uses:

- Perspective projection
- Dynamic obstacle scaling
- Horizon-based rendering
- Lane system similar to endless runners

Obstacles become larger as they approach the player, creating a simple 3D illusion while maintaining excellent performance.

---

### Collision Detection

The game uses rectangle-based collision detection.

Features:
- Fish hitbox
- Obstacle hitboxes
- Real-time collision checking
- Immediate game over state

---

### ☠️ Game Over System

When a collision occurs:

- Gameplay stops
- Game Over screen appears
- Restart prompt is displayed

Message shown:

```text
GAME OVER
Click to return to the ocean
```

Players can restart the game instantly with a tap.

---

### Score System

The game tracks:

- Current score
- Dynamic speed value

Displayed in the top corners of the screen.

---

### Custom UI

Features:

- Custom game font
- Cartoon-style text rendering
- Outline effects
- Ocean-themed interface

---

### Optimized Rendering

The project was designed with performance in mind.

Techniques used:

- SurfaceView rendering
- Dedicated game loop thread
- Bitmap reuse
- Lightweight collision system
- Minimal memory allocations during gameplay

---

## Technologies

- Java
- Android Studio (in the future)
- SurfaceView
- Canvas API
- Android Sensor Framework
- Gyroscope Sensor

---

##  Project Structure

```text
com.logic.game
│
├── bonuses
│   ├── Bonus
│   ├── BonusManager
│   └── BonusType
│
├── core
│   ├── CollisionManager
│   ├── GameEngine
│   ├── GameState
│   └── ScoreSystem
│
├── input
│   ├── GyroInput
│   └── InputHandler
│
├── obstacles
│   ├── Obstacle
│   ├── ObstacleManager
│   └── ObstacleType
│
├── player
│   ├── Fish
│   └── PlayerPhysics
│
├── utils
│   ├── Constants
│   ├── Timer
│   └── Vector2D
│
├── world
│   ├── DifficultyManager
│   └── Ocean
│
└── Main
```
---

## Future Improvements

Planned features:

- Animated ocean background
- Power-ups
- Coins and collectibles
- High score saving
- Pause menu
- Difficulty levels
- Particle effects
- Improved obstacle variety

---

## Educational Purpose

This project was created as a learning project to practice:

- Android game development
- Gyroscope integration
- Object-oriented programming
- Real-time rendering
- Collision detection
- Game loop architecture

---

## Important Note

This repository contains only the game logic and Android Studio implementation.

The project is intended as an educational Android game prototype focused on gyroscope-based gameplay and core game mechanics.

---

## Author

Created by 

AGH University of Krakow

Computational Engineering Student
