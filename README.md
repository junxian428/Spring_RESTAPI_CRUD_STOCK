# Spring_RESTAPI_CRUD_STOCK


AWS deployment practice

API Endpoint


GET ENDPOINT: http://localhost:8881/stocks

GET ENDPOINT by ID: http://localhost:8881/stocks/1

POST METHOD: http://localhost:8881/stocks

{"name": "Fire","price" : 5, "quantity":30}


PUT METHOD: http://localhost:8881/stocks/1

{"id": 1 ,"name": "Fire","price" : 5, "quantity":30}

DELETE METHOD: http://localhost:8881/stocks/1

public class Stock {

    private Integer id;

    private String name;

    private float price;

    private float quantity;

}


