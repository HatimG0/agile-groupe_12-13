@tag
Feature: Draft
	As a pokemon
	I want to join the most competitive basketball competition
	Because I want to pursue my dream to be the best basketball pokemon player of my era
	
  @tag1
  Scenario: Joey is drafted
    Given a pokemon Joey
    And with an attack with 5 and normal
    When he is drafted to the Bulls after the selection match
    Then he opens his NBA stats  

  @tag2
  Scenario Outline: A pokemon is drafted
  	Given a pokemon <pokemonplayer>
  	And with an attack with <damage> and <type>
  	When he is drafted to <club> after the selection match
  	Then he opens his NBA stats

    Examples: 
      | pokemonplayer  | damage | type | club |
      | Joey | 5 | normal | Bulls |
      | James| 4 | normal | Thunders|
