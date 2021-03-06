Feature: Consult games
  I, as a consumer of the API
  I want to consult the games to know their information

  @CompareGamesWithFrontend
  Scenario Outline: Consult games and compare with Frontend
    Given the user consults all games in the api by user <idUser>
    When he gets the games from the frontend with credentials <user> and <password>
    Then he should see that the frontend games are the same as the API

    Examples:
      | idUser | user     | password |
      | 1      | smoncada | 1234     |
      | 2      | root     | root     |

  @ConsultGameById
  Scenario Outline: Consult a game by id
    Given the user consults a game by id <idGame>
    When he looks for the game in the front with id <idGame> and credentials <user> and <password>
    Then he should see that the frontend game are the same as the API

    Examples:
      | idGame | user     | password |
      | 3      | smoncada | 1234     |
      | 2      | root     | root     |