CREATE SCHEMA IF NOT EXISTS account;

CREATE
EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE account.accounts
(
    id      uuid           NOT NULL,
    user_id uuid           NOT NULL,
    balance numeric(10, 2) NOT NULL,
    CONSTRAINT accounts_pkey PRIMARY KEY (id)
);