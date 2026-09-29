# Diagramme de classes du projet

```mermaid
classDiagram
    direction TB

    class `Iterator~Integer~` {
        <<interface>>
        +hasNext() boolean
        +next() Integer
        +remove() void
    }

    class TableauEntier {
        -tab: int[][]
        +TableauEntier(t: int[][])
        +valeurA(l: int, c: int) int
        +getLargeur() int
        +getLongueur() int
    }

    class Parcours {
        <<abstract>>
        #tab: TableauEntier
        #ligneCour: int
        #colonneCour: int
        #nbParcourus: int
        +Parcours(tab: TableauEntier)
        +Parcours(tab: int[][])
        +suivant()* void
        +hasNext() boolean
        +next() Integer
        +remove() void
    }

    class ParcoursLigne {
        +ParcoursLigne(tab: TableauEntier)
        +ParcoursLigne(tab: int[][])
        +suivant() void
    }

    `Iterator~Integer~` <|.. Parcours : implements
    Parcours <|-- ParcoursLigne : extends
    Parcours o--> "1" TableauEntier : -tab (agrégation/association)
```

## Description des classes et relations

- **`Iterator<Integer>`** : Interface standard Java pour l'itération (`hasNext()`, `next()`, `remove()`).
- **`TableauEntier`** : Encapsule un tableau 2D d'entiers avec ses accesseurs.
- **`Parcours`** : Classe abstraite implémentant `Iterator<Integer>`, conservant les indices et le compteur d'éléments parcourus, et déléguant le saut à la méthode abstraite `suivant()`.
- **`ParcoursLigne`** : Classe concrète étendant `Parcours` qui implémente le parcours ligne par ligne.
