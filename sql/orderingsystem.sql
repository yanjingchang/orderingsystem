/**
  t_admin:管理员数据表
  id:

 */
drop table if exists t_admin;
    set character_set_client = utf8mb4;
create table t_admin(
    id int(11) not null auto_increment,
    username varchar(11) default null,
    password varchar(11) default null,
    primary key(id)
)engine=innodb auto_increment=2 default charset=utf8;

/**
  t_user:用户数据表
  nickname:
  registerdate:注册时间
 */
drop table if exists t_user;
    set character_set_client = utf8mb4;
create table t_user(
    id int(11) not null auto_increment,
    username varchar(11) default null,
    password varchar(11) default null,
    nickname varchar(11) default null,
    gender varchar(2) default null,
    telephone varchar(20) default null,
    registerdate datetime default null,
    address varchar(20) default null,
    primary key (id)
)engine=innodb auto_increment=6 default charset = utf8;

/**
  t_type:菜品分类数据表
  id:
  name:
 */
drop table if exists t_type;
set character_set_client = utf8mb4;
create table t_type(
   id int(11) not null  auto_increment,
   name varchar(11) default null,
   primary key (id)
)engine=innodb auto_increment=6 default charset=utf8;


/**
  t_menu:菜品数据表
  id:
  name:菜品名
  price:菜品价格
  flavor:菜品风味
 */
drop table if exists t_menu;
    set character_set_client = utf8mb4;
create table t_menu(
    id int(11) not null auto_increment,
    name varchar(11) default null,
    price double default null,
    flavor varchar(11) default null,
    tid int(11)default null,
    primary key (id),
    key tid (tid),
    constraint t_menu_ibfk_1 foreign key (tid) references t_type(id)
)engine=innodb auto_increment=28 default charset=utf8;


/**
  t_order:订单数据表
  id:订单编号
  uid:下单用户的id
  mid:用户下单的菜品数据id
  aid:
  date：下单时间
  state:订单状态
 */
drop table if exists t_order;
    set character_set_client = utf8mb4;
create table t_order(
    id int(11) not null auto_increment,
    uid int(11) default null,
    mid int(11) default null,
    aid int(11) default null,
    date date default null,
    state int(11)default null,
    primary key (id),
    key uid (uid),
    key mid (mid),
    key aid (aid),
    constraint t_order_ibfk_1 foreign key (uid) references t_user(id),
    constraint t_order_ibfk_2 foreign key (mid) references t_menu(id),
    constraint t_order_ibfk_3 foreign key (aid) references t_admin(id)
)engine=innodb auto_increment=28 default charset=utf8;

