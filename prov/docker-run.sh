#!/bin/bash

# ports: 
#  80 -> 8800 - ui
#  2003       - plaintext protocol
#  2004       - pickle protocol
#  7002       - ?
#
# default login:
#  user       - admin 
#  password   - admin
#
docker run --name graphite -p 8800:80 -p 2003:2003 -d nickstenning/graphite
