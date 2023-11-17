Feature: Move in a direction 
![SpecByExample](images/spe.jpg)
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | endingPositionX | endingPositionY | startingMoveCount | endingMoveCount |
            | 9 | 0 | NORTH | 9 | 1 | 10 | 11 |
            | 9 | 0 | SOUTH | 9 | 0 | 15 | 16 |
            | 9 | 0 | EAST | 9 | 0 | 10 | 11 |
            | 9 | 0 | WEST | 8 | 0 | 17 | 18 |
            | 0 | 0 | NORTH | 0 | 1 | 50 | 51 |
            | 0 | 0 | SOUTH | 0 | 0 | 52 | 53 |
            | 0 | 0 | EAST | 1 | 0 | 100 | 101 |
            | 4 | 6 | WEST | 3 | 6 | 23 | 24 |
            | 4 | 6 | EAST | 5 | 6 | 52 | 53 |
            | 4 | 6 | NORTH | 4 | 7 | 122 | 123 |
            | 4 | 6 | SOUTH | 4 | 5 | 10 | 11 |
            | 5 | 5 | SOUTH | 5 | 4 | 0 | 1 |
            | 0 | 9 | EAST | 1 | 9 | 20 | 21 |
            | 0 | 9 | SOUTH | 0 | 8 | 32 | 33 |
            | 9 | 9 | NORTH | 9 | 9 | 12 | 13 |
            | 9 | 9 | EAST | 9 | 9 | 17 | 18 |
            | 5 | 3 | SOUTH | 5 | 2 | 3 | 4 |
            | 5 | 5 | NORTH | 5 | 6 | 0 | 1 |
            | 5 | 6 | SOUTH | 5 | 5 | 6 | 7 |