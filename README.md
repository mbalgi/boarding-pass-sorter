# Boarding Pass Sorting App

This project exposes an API to sort the Boarding passes given the input boarding passes details in any unsorted order.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally
Checkout the project and navigate to the project folder and run teh below command in terminal

```shell
mvn spring-boot:run
```

## Accessing the swagger documentation and api testing

http://localhost:8080/swagger-ui.html#/

Testing the APi using swagger use the below link:

http://localhost:8080/swagger-ui.html#/boarding-pass-controller/sortBoardingPassUsingPOST

Give the input in the following format
```json
[
    {
        "from":"Gerona Airport",
        "to":"Stockholm",
        "transportationType":"flight",
        "transportationNumber":"SK455",
        "seat":"3A",
        "Gate":"45B",
        "baggage":"344"
    },
    {
        "from":"Madrid",
        "to":"Barcelona",
        "transportationType":"train",
        "transportationNumber":"78A",
        "seat":"45B"
    },
    {
        "from":"Stockholm",
        "to":"New York JFK",
        "transportationType":"flight",
        "transportationNumber":"SK22",
        "seat":"7B",
        "Gate":"22"
    },
    {
        "from":"Barcelona",
        "to":"Gerona Airport",
        "transportationType":"bus"
    }
]
```
Output should be sorted as follows:
```json
[
  {
    "from": "Madrid",
    "to": "Barcelona",
    "transportationType": "train",
    "transportationNumber": "78A",
    "seat": "45B",
    "gate": null,
    "baggage": null
  },
  {
    "from": "Barcelona",
    "to": "Gerona Airport",
    "transportationType": "bus",
    "transportationNumber": null,
    "seat": null,
    "gate": null,
    "baggage": null
  },
  {
    "from": "Gerona Airport",
    "to": "Stockholm",
    "transportationType": "flight",
    "transportationNumber": "SK455",
    "seat": "3A",
    "gate": null,
    "baggage": "344"
  },
  {
    "from": "Stockholm",
    "to": "New York JFK",
    "transportationType": "flight",
    "transportationNumber": "SK22",
    "seat": "7B",
    "gate": null,
    "baggage": null
  }
]
```
