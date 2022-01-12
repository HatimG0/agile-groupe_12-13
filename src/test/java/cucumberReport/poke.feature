@tag
Feature: Pokemon
	As a pokemon
	I want to grow up
	Because I want to be the best pokemon

	
  @tag1
  Scenario: Pikachu is a pokemon species
    Given a pokemon Pikachu
    And with 30 PV
    And with level 1
    Then with a miracle he pass to level 2
  
  @tag2
  Scenario Outline: Pokemon is a pokemon species
  	Given a pokemon <pokemon>
  	And with <pv> PV
  	And with level 1
  	Then with a miracle he pass to level <level>

    Examples: 
      | pokemon  | pv | level |
      | Pikachu | 30 | 5 |
