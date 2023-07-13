-- 班级表=========================================================
drop table if exists tb_class;

create table tb_class
(
  cid integer auto_increment primary key not null comment '主键',
  cname varchar(50) not null comment '班级名称',
  cinfo varchar(50) not null comment '班级描述',
  lastupdate timestamp default now() not null comment '注册时间'
)comment '班级信息表';

insert into tb_class(cname,cinfo) values('一班','一般');
insert into tb_class(cname,cinfo) values('二班','不一般');

select * from tb_class;
