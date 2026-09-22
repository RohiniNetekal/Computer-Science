# REST API Design — Backend Notes

A practical approach to designing a REST endpoint.

## Example

~~~json
{
  "name": "Demo Merchant",
  "paymentMethods": ["UPI", "CARD"]
}
~~~

~~~text
POST /api/merchants
~~~

## Design checklist

- Use nouns for resources: /merchants, not /createMerchant.
- Use HTTP methods according to intent: GET, POST, PUT/PATCH, DELETE.
- Validate request DTOs at the API boundary.
- Return appropriate HTTP status codes.
- Keep controllers small; delegate business logic to a service.
- Do not expose persistence entities directly when an API contract needs a DTO.
- Keep error responses consistent across endpoints.
- Document pagination, filtering, and sorting explicitly.
- Never put secrets or sensitive data in URLs.

## Typical Spring Boot structure

~~~text
controller -> service -> repository/DAO -> database
                  |
                domain
~~~

This is learning/demo material, not a representation of any employer's internal API.
