drop table IF EXISTS TRIP cascade ;
drop table IF EXISTS GENRE cascade ;
drop table IF EXISTS BOOK cascade ;

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
type_of_activity varchar(255),
distance bigint(30),
trip_id bigint references trip(id)
);


create TABLE IF NOT EXISTS acl_sid (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  principal tinyint(1) NOT NULL,
  sid varchar(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY unique_uk_1 (sid,principal)
);

create TABLE IF NOT EXISTS acl_class (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  class varchar(255) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY unique_uk_2 (class)
);
 
create TABLE IF NOT EXISTS acl_entry (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  acl_object_identity bigint(20) NOT NULL,
  ace_order int(11) NOT NULL,
  sid bigint(20) NOT NULL,
  mask int(11) NOT NULL,
  granting tinyint(1) NOT NULL,
  audit_success tinyint(1) NOT NULL,
  audit_failure tinyint(1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY unique_uk_4 (acl_object_identity,ace_order)
);
 
create TABLE IF NOT EXISTS acl_object_identity (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  object_id_class bigint(20) NOT NULL,
  object_id_identity bigint(20) NOT NULL,
  parent_object bigint(20) DEFAULT NULL,
  owner_sid bigint(20) DEFAULT NULL,
  entries_inheriting tinyint(1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY unique_uk_3 (object_id_class,object_id_identity)
);
 
alter table acl_entry
add FOREIGN KEY (acl_object_identity) REFERENCES acl_object_identity(id);

alter table acl_entry
add FOREIGN KEY (sid) REFERENCES acl_sid(id);
 
--
-- Constraints for table acl_object_identity
--
alter table acl_object_identity
add FOREIGN KEY (parent_object) REFERENCES acl_object_identity (id);

alter table acl_object_identity
add FOREIGN KEY (object_id_class) REFERENCES acl_class (id);

alter table acl_object_identity
add FOREIGN KEY (owner_sid) REFERENCES acl_sid (id);