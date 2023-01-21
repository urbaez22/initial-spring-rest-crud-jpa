-- Companies
CREATE TABLE companies (
   id serial NOT NULL,
   name varchar(512) NOT NULL,
   site_url varchar(512) NOT NULL,
   CONSTRAINT "COMPANIES_PK" PRIMARY KEY (id)
) WITH (
  OIDS = FALSE
);
ALTER TABLE companies OWNER TO newappuser;
	
-- People
CREATE TABLE people (
   id serial NOT NULL,
   fullname varchar(512) NOT NULL,
   email varchar(255) NOT NULL,
   phone_number varchar(64) NOT NULL,
   address varchar(512) NOT NULL,
   CONSTRAINT "PEOPLE_PK" PRIMARY KEY (id)
) WITH (
  OIDS = FALSE
);
ALTER TABLE people OWNER TO newappuser;

-- Jobs
CREATE TABLE jobs (
   id serial NOT NULL,
   company_id integer NOT NULL,
   person_id integer NOT NULL,
   role_title varchar(512) NOT NULL,
   role_description varchar(255) NOT NULL,
   started_at timestamp NOT NULL,
   finished_at timestamp NOT NULL,
   CONSTRAINT "JOBS_PK" PRIMARY KEY (id),
   CONSTRAINT "JOBS_FK1" FOREIGN KEY (company_id) REFERENCES companies (id) ON UPDATE CASCADE ON DELETE RESTRICT,
   CONSTRAINT "JOBS_FK2" FOREIGN KEY (person_id) REFERENCES people (id) ON UPDATE CASCADE ON DELETE RESTRICT
) WITH (
  OIDS = FALSE
);
ALTER TABLE jobs OWNER TO newappuser;



