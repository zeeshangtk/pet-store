# PetStore

## _Project to learn K8 and helm_

Petstore is a learning project to learn K8 and helm

## Tech

- Java 21
- Maven
- Postgres 16
- K8
- Helm

## Commands

### To run db migration

```sh
mvn clean install flyway:migrate -Dflyway.configFiles=flyway.conf
```

### To install helm chart for app and statefulset

```sh
helm install pet-store-backend ./helm --values ./helm/values.yaml
helm install pet-store-db ./pet-store-db-helm --values ./pet-store-db-helm/values.yaml
```
