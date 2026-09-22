# Spring Security & JWT — Learning Notes

JWT-based authentication separates authentication from authorization.

## Request flow

~~~text
Client -> POST /auth/login
          |
          v
      authenticate
          |
          v
       issue JWT
          |
          v
Client -> Authorization: Bearer <token>
          |
          v
JWT filter -> validate signature/claims -> authorize request
~~~

## JWT should contain

Only claims required by the application, such as:
- subject/user identifier
- roles or authorities when appropriate
- issued-at and expiry

Do not place passwords, secrets, or unnecessary sensitive information in a token.

## Security checklist

- Use HTTPS.
- Use short-lived access tokens where appropriate.
- Protect signing keys and rotate them safely.
- Validate signature, expiry, issuer, and audience when applicable.
- Apply authorization rules at the endpoint/service boundary.
- Never log raw access tokens.

This is a security learning module. It contains no real credentials or production secrets.
