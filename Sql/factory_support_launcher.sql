create table if not exists factory_support_launcher(
set_id Integer not null,
factory_support_id Integer null,
factory_support_budget_indicator varchar(255) null,
factory_support_sheet varchar(255) null,
factory_support_control_flag varchar(255) null,
factory_support_desc varchar(255) null,
factory_support_short_desc varchar(255) null,
factory_support_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint factory_support_launcher_pk primary key(set_id));
