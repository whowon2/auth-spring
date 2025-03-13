package whowon2.auth.rest;

import org.springframework.data.jpa.repository.JpaRepository;

interface Repository extends JpaRepository<User, Long> {}
