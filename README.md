# myRetail-RestPerformance

Prequisites
1. JDK 1.8
2. Maven 3.0+
3. IDE 

Installation
1. Clone the project from github : git clone https://github.com/Prachee30/myRetail-RestPerformance.git
2. Run the command in terminal : mvn clean install 
3. Install Jmeter for performance testing
4. Install Postman to test calls to APIs.

Requests (Make sure that the application is up and running while performing these requests)

#GET
http://localhost:8081/myRetail/products

#GET by Id
http://localhost:8081/myRetail/product/13860433

#POST 
http://localhost:8081/myRetail/addProduct

#POST
http://localhost:8081/myRetail/addProducts

#PUT
http://localhost:8081/myRetail/updateProduct

#PUT
http://localhost:8081/myRetail/updateProduct/13860433

#DELETE
http://localhost:8081/myRetail/delete/13860434


Data

[{"productId":13860433,"currentPrice":{"currentPriceId":69,"value":9999,"currencyCode":"USD"}},
{"productId":13860434,"currentPrice":{"currentPriceId":70,"value":239,"currencyCode":"INR"}},
{"productId":13860435,"currentPrice":{"currentPriceId":71,"value":1199,"currencyCode":"USD"}}]
