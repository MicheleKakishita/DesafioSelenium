Feature: Register a new Vehicle Insurance

  Scenario Outline: Populate Vehicle Data
    Given user is on vehicle insurance application
    And user is on automobile form
    When user populates the <form>
      | make               | <make>               |
      | engineperformance  | <engineperformance>  |
      | dateofmanufacture  | <dateofmanufacture>  |
      | numberofseats      | <numberofseats>      |
      | fuel               | <fuel>               |
      | listprice          | <listprice>          |
      | licenseplatenumber | <licenseplatenumber> |
      | annualmileage      | <annualmileage>      |
    And all mandatory fields are populated
    Then user hits <send> and go to next step

    Examples: 
      | form             | send                  | make | engineperformance | dateofmanufacture | numberofseats | fuel   | listprice | licenseplatenumber | annualmileage |
      | entervehicledata | nextenterinsurantdata | Audi |              1500 | 08/10/2021        |             4 | Petrol |      2000 |               4242 |          1000 |

  Scenario Outline: Populate Insurant Data
    When user populates the <form>
      | firstname     | <firstname>     |
      | lastname      | <lastname>      |
      | birthdate     | <birthdate>     |
      | gender        | <gender>        |
      | streetaddress | <streetaddress> |
      | country       | <country>       |
      | zipcode       | <zipcode>       |
      | city          | <city>          |
      | occupation    | <occupation>    |
      | hobbies       | <hobbies>       |
    And all mandatory fields are populated
    Then user hits <send> and go to next step

    Examples: 
      | form              | send                 | firstname | lastname  | birthdate  | gender       | streetaddress | country | zipcode  | city    | occupation | hobbies              |
      | enterinsurantdata | nextenterproductdata | Michele   | Kakishita | 08/29/1984 | genderfemale | Rua Teste     | Brazil  | 13202265 | Jundiai | Employee   | speeding;cliffdiving |

  Scenario Outline: Populate Product Data
    When user populates the <form>
      | startdate        | <startdate>        |
      | insurancesum     | <insurancesum>     |
      | meritrating      | <meritrating>      |
      | damageinsurance  | <damageinsurance>  |
      | optionalproducts | <optionalproducts> |
      | courtesycar      | <courtesycar>      |
    And all mandatory fields are populated
    Then user hits <send> and go to next step

    Examples: 
      | form             | send                  | startdate  | insurancesum | meritrating | damageinsurance | optionalproducts                     | courtesycar |
      | enterproductdata | nextselectpriceoption | 11/16/2021 |      5000000 | Bonus 2     | No Coverage     | EuroProtection;LegalDefenseInsurance | No          |

  Scenario Outline: Select Price Option
    When user populates the <form>
      | priceoption | <priceoption> |
    And all mandatory fields are populated
    Then user hits <send> and go to next step

    Examples: 
      | form              | send          | priceoption |
      | selectpriceoption | nextsendquote | selectgold  |

  Scenario Outline: Send Quote
    When user populates the <form>
      | email           | <email>           |
      | phone           | <phone>           |
      | username        | <username>        |
      | password        | <password>        |
      | confirmpassword | <confirmpassword> |
    And all mandatory fields are populated
    Then user hits <send> and go to next step
    And success <message> is displayed

    Examples: 
      | form      | send      | email           | phone       | username | password  | confirmpassword | message                 |
      | sendquote | sendemail | teste@gmail.com | 11995664621 | username | Pass12345 | Pass12345       | Sending e-mail success! |
