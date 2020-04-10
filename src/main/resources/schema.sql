--
-- Table structure for table student_detail
--

DROP TABLE IF EXISTS student_detail;
CREATE TABLE student_detail
(
    id  INT (11) unsigned NOT NULL AUTO_INCREMENT,
    age INT (11) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Table structure for table student
--

DROP TABLE IF EXISTS student;
CREATE TABLE student
(
    id                INT (11) unsigned NOT NULL AUTO_INCREMENT,
    NAME              VARCHAR(255) DEFAULT NULL,
    student_detail_id INT (11) unsigned DEFAULT NULL,
    PRIMARY KEY (id),
    KEY               fk_student_studentdetail(student_detail_id),
    CONSTRAINT fk_student_studentdetail FOREIGN KEY
        (student_detail_id) REFERENCES student_detail (id) ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;