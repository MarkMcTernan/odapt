# odapt (oh-dapt)
odapt - a modular repository framework for tranforming data sources into objects and back again.

A java implementation of a high performance micro-ORM that supports:
* efficient, CRUD Repo operations in the Fluent style...
* that declares source agnostic metadata via annotated pojo's...
* serialized and deserialized via decoupled, readily extensible lamda based data adapters and data transformation pipelines...
* bridged to the last mile using a unified wrapper for data access API's for supporting 3NF, NoSQL & stream based datastores...
* ...to present a unified, object repository with EF style optimizations that are entirely persistence store agnostic.

# Party Slogans:
"Let the database and the code do what they do best"
"ORM's don't exist to spare you from SQL"

# Status:
This is an experiment in Java from a C# dude that is disastisfied by the lack of ORM's in Java that match the capabilities and situational appropriateness of .Net ORM's such as EF and Dapper. (Considering the shared problem space that Java and .Net are commonly applied to, I believe this is due to Java's Runtime Type Erasure, relatively sparse Reflection, and lack of both extension methods and a superior Object Query extensions like LINQ.  (If you think that Filters to LINQ you need to stop drinking the Koolaid.)  It's just getting rolling, so no useful code as of yet.

# Roadmap
- Configurable Mapping via generics is up first.
- Unified Repo interfaces are next.
- Unified Context wrappers to control connections and transactions via pre-existing datastore agnostic api's
- Several reference implementations of the wrappers.
- A Fluid style approximation of IQueryable that leverages lambda expression parsing to optimize cached and non-cached operations.
- Several Reference implementations of IQueryable.
- useful code!
