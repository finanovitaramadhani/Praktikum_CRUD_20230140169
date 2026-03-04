# User API Specification

Base URL

http://localhost:8080

---

# 1. Create User

Endpoint

POST /api/users

## Request Body Success

```json
{
  "name": "Fina",
  "age": 20
}
```

Respone Body (Success) :

```json
{
    "data": {
        "age": 20,
        "id": "c8fcba5a-b030-49ca-9176-7f1aae5baffb",
        "name": "Fina"
    },
    "status": "success"
}
```
## Request Body Failed

```json
{
  "age": 20
}
```
Respone Body (Failed) :

```json
{
    "error": "Invalid input data"
}
```
# 2. Get All

Endpoint

GET /api/users

Respone Body (Success) :

```json
{
  "data": [
    {
      "age": 19,
      "id": "824fa2ae-9ece-4268-951c-0e671f3910e3",
      "name": "Novita"
    },
    {
      "age": 17,
      "id": "c7a3abec-acbf-47ec-9e5b-bda5028339ba",
      "name": "Ramadhani"
    },
    {
      "age": 20,
      "id": "c8fcba5a-b030-49ca-9176-7f1aae5baffb",
      "name": "Fina"
    }
  ],
  "status": "success"
}
```
Endpoint Failed

GET /api/user

Respone Body (Failed) :

```json
{
    "error": "Invalid input data"
}
```
# 3. Get BY

Endpoint

GET /api/users/id

GET /api/users/824fa2ae-9ece-4268-951c-0e671f3910e3

Respone Body (Success) :

```json
{
  "data": {
    "age": 19,
    "id": "824fa2ae-9ece-4268-951c-0e671f3910e3",
    "name": "Novita"
  },
  "status": "success"
}
```
Endpoint failed

GET /api/users/824fa2ae (id tidak lengkap)

Respone Body (Failed) :

```json
{
    "error": "Invalid input data"
}
```
# 4. PUT

Endpoint

PUT /api/users/id

PUT /api/users/824fa2ae-9ece-4268-951c-0e671f3910e3

## Request Body Success

```json
{
  "name": "Novita Putri",
  "age": 22
}
```

Respone Body (Success) :

```json
{
  "data": {
    "age": 22,
    "id": "824fa2ae-9ece-4268-951c-0e671f3910e3",
    "name": "Novita Putri"
  },
  "status": "success"
}
```
Endpoint failed

PUT /api/users/824fa2ae (id tidak lengkap)

Respone Body (Failed) :

```json
{
    "error": "Invalid input data"
}
```
# 5. DELETE

Endpoint

DELETE /api/users/id

DELETE /api/users/824fa2ae-9ece-4268-951c-0e671f3910e3

Respone Body (Success) :

```json
{
  "status": "success delete user with id 824fa2ae-9ece-4268-951c-0e671f3910e3"
}
```
Endpoint failed

PUT /api/users/824fa2ae (id tidak lengkap)

Respone Body (Failed) :

```json
{
    "error": "Invalid input data"
}
```



