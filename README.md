# Hibernate N+1 Problem

### Overview

This repository contains simple Spring Boot application that is intended to illustrate N+1 problem in Hibernate.

### Disclaimer

The app is intended to demonstrate N+1 problem in action only. The quality of code is not a subject for discussion.
Things like "repository in controller" or "data transformation in dto" were implemented for simplicity.

### How to work with the app?

1) Run it
2) Check `book-api.http` file
3) Use `POST`call from the file to do first data init
4) Use `GET` call from the file to reproduce the problem

### Description
Full description of N+1 problem and the way how to avoid it can be found here:
https://www.anverbogatov.com/posts/hibernate-n1-problem/
