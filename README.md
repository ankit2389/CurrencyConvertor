# Currency Converter Backend

A simple backend application built with **Java Spring Boot** that performs real-time currency conversion using external exchange rate APIs.

---

## Quick Start

### Clone the Repository
```bash
git clone https://github.com/ankit2389/CurrencyConverter.git
cd CurrencyConverter
```

### Run the Application
```bash
mvn clean install
mvn spring-boot:run
```
The application will start at `http://localhost:8080`.

---

## Example API Usage

### Currency Conversion Endpoint
**Request:**
```
GET /api/currency/convert?from=USD&to=INR&amount=100
```

#### Example Response:
```json
{
    "base": "USD",
    "rates": {
        "INR": 83.25
    },
    "convertedAmount": 8325.0
}
```
