Feature:



  Scenario:Verifying header of the page before ordering the toy,
    Given The user at the webpage
    When The user wants to verify text as "Mother Elephant With Babies Soft Toy"


  Scenario:verifying that the toy price is 20$
    Given The user at the webpage
    When The user wants to verify price as "20$"


  Scenario:verifying the URL that contains “payment-gateway”
    Given The user at the webpage
    When The user wants to verify url contains as “payment-gateway”

  Scenario:The quantity must be 5You may need to fake enter card information (Card number will be 16 digit)
  Once you order, you should be able to verify “Payment successfull!” text.
    Given The user at the webpage
    When The user wats to set quantity as 5
    And The user clicks buy button
    Then The user puts credit card informations
    Then The user want to verify "payment successfull!"



