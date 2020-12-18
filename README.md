# jx3-demoapp5

A very exciting appliation with a `/hello` endpoint

Run the application locally, and test `GET`ing the `/hello` endpoint.

```bash
$ curl -v http://localhost:8080/hello
*   Trying 127.0.0.1:8080...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /hello HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.68.0
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Wed, 02 Dec 2020 19:47:22 GMT
< 
* Connection #0 to host localhost left intact
{"hello":"world!"}
```

## Fake News

* your mom called