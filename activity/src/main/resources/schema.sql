drop table IF EXISTS TRIP cascade ;
drop table IF EXISTS ACTIVITY cascade ;

create table trip(
id bigserial,
title varchar(255),
location varchar(255),
trip_start timestamp,
trip_finish timestamp,
primary key (id)
);

create table activity(
id bigserial,
name varchar(255),
distance bigint(30),
type varchar(255),
trip_id bigint references trip(id)
);