-- 1757. recyclable and Low Fat Products
SELECT product_id FROM PRODUCTS WHERE low_fats = 'Y' and recyclable = 'Y';

-- 587. Find Customer referee
SELECT name FROM CUSTOMER WHERE coalesce(referee_id,0)<>2;

-- 595 Big Countries
SELECT NAME,POPULATION,AREA FROM WORLD WHERE AREA >= 3000000 OR POPULATION >= 25000000;

-- 1148. Article Views I
SELECT DISTINCT AUTHOR_ID as 'id' FROM VIEWS WHERE AUTHOR_ID = VIEWER_ID ORDER BY author_id ASC;

-- 1683. Invalid Tweets
SELECT TWEET_ID FROM TWEETS WHERE LENGTH(content) > 15;