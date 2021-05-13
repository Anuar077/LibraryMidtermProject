CREATE TABLE posts1
(
    pId serial PRIMARY KEY,
    title   text,
    pContent text,
    username    text
);
CREATE TABLE comments1
(
   cId serial PRIMARY KEY,
    content  text,
    pId text,
    username    text
);