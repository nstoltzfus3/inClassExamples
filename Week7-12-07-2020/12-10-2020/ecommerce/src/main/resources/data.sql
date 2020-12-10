MERGE INTO `role` VALUES (1,'USER');

merge into `product` values 
	(1, 
	'garmin', 
	'watch',
	'Watch designed to keep track of your ****.',
	'https://www.staples-3p.com/s7/is/image/Staples/sp56444204_sc7?$std$',
	'Good Garmin Watch',
	10000000,
	3);
merge into `product` values 
	(2, 
	'ForksRUS', 
	'fork',
	'Fork for forking forked forks.',
	'https://m.media-amazon.com/images/I/71MukE4FB7L._AC_SL1500_.jpg',
	'Big Fork',
	333333,
	6000);
merge into `product` values 
	(3, 
	'Pinky Thimbles Anonymous', 
	'thimble',
	'For those of you that need to keep your thimbles on the down low.',
	'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4PGHA8FBKofkh8cBHh-aOJVe7oYxBt_gO5Q&usqp=CAU',
	'Covert Pinky Thimble',
	7345,
	2)
--USER_ID  	BRAND  	CATEGORY  	DESCRIPTION  	IMAGE_URL  	NAME  	PRICE  	QUANTITY  
