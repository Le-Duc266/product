create table category
(
    "id"   bigserial PRIMARY KEY,
    "code" varchar(250),
    "name" varchar(250),
    "type" varchar(250),
    "isActive" BOOLEAN default true,
    created_at      TIMESTAMP,
    updated_at      TIMESTAMP,
    created_by      BIGINT,
)
alter sequence category increment by 50;