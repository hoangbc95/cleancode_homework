INSERT INTO users(id, name, email, password) VALUES
(1, 'Alice', 'alice@gmail.com', '123456'),
(2, 'Bob', 'bob@gmail.com', '123456'),
(3, 'David', 'david@gmail.com', '123456');
 
INSERT INTO students(id, year) VALUES
 (1, 3);
 
INSERT INTO teachers(id, phone, experiences) VALUES
(2, '0987654321', 1),
(3, '0987654322', 2);

INSERT INTO courses(id, teacher_id, name, description, location, opened) VALUES
(1, 2, 'Clean Code', 'clean code', 'HN', '2021-01-01'),
(2, 3, 'Clean Code 2', 'clean code 2', 'HN', '2021-02-02'),
(3, 2, 'Java Spring Boot', 'java spring boot', 'HN', '2021-03-03');