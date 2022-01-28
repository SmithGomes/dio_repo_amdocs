INSERT INTO PERSON( birth_date, cpf, first_name, last_name ) VALUES( '2001-01-01', '794.429.170-48', 'Rodrigo', 'Peleias' ), ( '1990-01-01', '648.450.720-17', 'Camila', 'Cavalcante' ), ( '2000-01-20', '165.628.430-81', 'Adriana', 'Silva' ), ( '1875-10-08', '345.253.970-98', 'Juliana', 'Mascarenhas' ), ( '1995-01-01', '140.619.590-18', 'Anderson', 'Menezes' ), ( '1980-01-01', '353.680.540-09', 'Cassio', 'Lima' )

INSERT INTO PHONE( number, type ) VALUES( '(11)00000-0000', 'COMMERCIAL' ), ( '(11)99999-9999', 'MOBILE' ), ( '(11)3611-3611', 'HOME')

INSERT INTO PERSON_PHONES(person_id, phones_id) VALUES( 1, 1), ( 2, 2), ( 3, 3)
