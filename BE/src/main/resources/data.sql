insert into users(email, name, password, profile_message)
values ('dhlee@codepresso.kr', 'dhlee', 'asdf1234',  'hello');
insert into users(email, name, password, profile_message)
values ('jhkim@codepresso.kr', 'jhkim', 'asdf1234',  'hello');

insert into post(content, author, count_liked)
values ('my name is code', 1, 10);
insert into post(content, author, count_liked)
values ('hi code', 2, 1);

insert into comment(author, content, post_id)
values (1, 'hi', 1);
insert into comment(author, content, post_id)
values (2, 'hello', 1);
insert into comment(author, content, post_id)
values (1, 'hello~', 2);
insert into comment(author, content, post_id)
values (2, 'hi!!', 2);