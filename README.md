# Java OOP Challenge: Army Simulation

### Difficulty: PRE-INTERMEDIATE

Remember to write readable, clean code with object-oriented principles. The goal of this challenge is to practice Java OOP concepts while maintaining simplicity. Beware of over-engineering. The hardest thing is to find balance.

---

## Army Description

Create an army of soldiers with special abilities. Execute commands.

- Create an **Army** with at least **3 different types of soldiers** (e.g., offensive, defensive, and adaptable).
- Soldiers have some common properties like `name` and `damage`.
- Issue commands to an army:
    - Make defensive soldiers defend.
    - Make offensive soldiers attack.
    - Include a `report` command where every soldier reports itself by printing its name.
    - Add other commands as needed.
- React to each command in your army with different behaviors from the soldiers.
- Practice inheritance and polymorphism.

---

## Constraints

1. Have at least **3 types of soldiers**.
2. Each soldier has a **special ability** that your army can use (e.g., Knights can flank an enemy).
3. Have at least **3 different commands**.
4. Include a `report` command where every soldier reports itself.

---

## Example Program Output
```plaintext
-------REPORT--------
Soldier Swordsman 1 here. Type - ADAPTABLE
Soldier Swordsman 2 here. Type - ADAPTABLE
Soldier Archer 1 here. Type - DEFENSIVE
Soldier Archer 2 here. Type - DEFENSIVE
Soldier Archer 3 here. Type - DEFENSIVE
Soldier Spearman 1 here. Type - DEFENSIVE
Soldier Spearman 2 here. Type - DEFENSIVE
Soldier berserk 1 here. Type - DEFENSIVE
Soldier Knight 1 here. Type - OFFENSIVE
Soldier Knight 2 here. Type - OFFENSIVE
Soldier Knight 3 here. Type - OFFENSIVE


-------ATTACK--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Berserk berserk 1 deals 3 damage.
Knight Knight 1 deals 5 damage.
Knight Knight 2 deals 5 damage.
Knight Knight 3 deals 5 damage.


-------DEFEND--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Archer Archer 1 deals 2 damage.
Archer Archer 2 deals 2 damage.
Archer Archer 3 deals 2 damage.
Spearman Spearman 1 deals 4 damage.
Spearman Spearman 2 deals 4 damage.


-------FURY ATTACK--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Berserk berserk 1 deals 6 damage.
Knight Knight 1 deals 5 damage.
Knight Knight 2 deals 5 damage.
Knight Knight 3 deals 5 damage.


-------FIRE DEFEND--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Archer Archer 1 deals 4 damage.
Archer Archer 2 deals 4 damage.
Archer Archer 3 deals 4 damage.
Spearman Spearman 1 deals 4 damage.
Spearman Spearman 2 deals 4 damage.


-------FLANK--------
Knight Knight 1 is flanking
Knight Knight 2 is flanking
Knight Knight 3 is flanking

Process finished with exit code 0
