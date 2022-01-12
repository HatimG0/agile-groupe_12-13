@tag
Feature: Pokemon
	As a pokemon
	I want to grow up
	Because I want to be the best pokemon

	
  @tag1
  Scenario: Pokemon is a species
    Given a Pokemon species
    Then someone with this species is created
  
  @tag2
  Scenario Outline: Pokemon is a species
  	Given a <species> species
  	Then someone with this species is created

    Examples: 
      | species  | 
      | Pokemon |
