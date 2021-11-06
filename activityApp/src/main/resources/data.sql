insert into trip  (id, `title`, `location`, `trip_start`, `trip_finish`)
values (1, 'Hungarial Autumn Holidays', 'Hungary', '2021-10-02 12:12:10', '2021-10-17 21:12:10');
insert into activity  (id, `type_of_activity`, `distance`, `trip_id`)  values (1, 'hike',  30,  1);
insert into activity  (id, `type_of_activity`, `distance`, `trip_id`)  values (2, 'hike',  50,  1);

insert into acl_sid (id, principal, sid) values
(1, 1, 'owner'),
(2, 1, 'guest');

insert into acl_class (id, class) values
(1, 'spb.family.FamilyActivityApp.domain.Trip');

insert into acl_object_identity (id, object_id_class, object_id_identity, parent_object, owner_sid, entries_inheriting) values
(1, 1, 1, null, 1, 0),
(2, 1, 2, NULL, 1, 0),
(3, 1, 3, NULL, 1, 0);

insert into acl_entry (id, acl_object_identity, ace_order, sid, mask,
                       granting, audit_success, audit_failure) values
(1, 1, 1, 1, 1, 1, 1, 1),
(2, 1, 2, 1, 2, 1, 1, 1),
(3, 1, 3, 2, 1, 1, 1, 1),
(4, 2, 1, 1, 1, 1, 1, 1),
(5, 2, 2, 1, 2, 1, 1, 1),
(6, 2, 3, 2, 1, 1, 1, 1),
(7, 3, 1, 1, 1, 1, 1, 1),
(8, 3, 2, 1, 2, 1, 1, 1),
(9, 3, 3, 2, 1, 1, 1, 1);
