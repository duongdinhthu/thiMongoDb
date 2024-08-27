# 1. Insert Orders
POST http://localhost:8080/orders/insert
Content-Type: application/json

[
{
"orderid": 1,
"products": [
{
"productId": "quanau",
"productName": "quan au",
"size": "XL",
"price": 10,
"quantity": 1
},
{
"productId": "somi",
"productName": "ao so mi",
"size": "XL",
"price": 10.5,
"quantity": 2
}
],
"totalAmount": 31,
"deliveryAddress": "Hanoi"
},
{
"orderid": 2,
"products": [
{
"productId": "somi",
"productName": "ao so mi",
"size": "L",
"price": 10.5,
"quantity": 1
},
{
"productId": "giay",
"productName": "giay tay",
"size": "42",
"price": 20,
"quantity": 1
}
],
"totalAmount": 30.5,
"deliveryAddress": "Ho Chi Minh"
}
]

###

# 2. Update Delivery Address by orderid
PUT http://localhost:8080/orders/update-address/1
Content-Type: text/plain

"Danang"

###

# 3. Remove an Order
DELETE http://localhost:8080/orders/remove/2

###

# 4. Get All Orders
GET http://localhost:8080/orders/all

###

# 5. Count total product_id equal “somi”
GET http://localhost:8080/orders/count/somi
