CREATE TABLE `blog` (
                        `id` varchar(50) NOT NULL COMMENT '博客id',
                        `title` varchar(100) NOT NULL COMMENT '博客标题',
                        `author` varchar(30) NOT NULL COMMENT '博客作者',
                        `create_time` datetime NOT NULL COMMENT '创建时间',
                        `views` int(30) NOT NULL COMMENT '浏览量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE book (
                      id INT AUTO_INCREMENT,
                      title VARCHAR(100),
                      author VARCHAR(100),
                      publicationdate DATE,
                      publisher VARCHAR(50),
                      PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
