CREATE TABLE posts
(
    pId serial PRIMARY KEY,
    title   text,
    pContent text,
    username    text
);
CREATE TABLE comments
(
   cId serial PRIMARY KEY,
    content  text,
    pId text,
    username    text
);