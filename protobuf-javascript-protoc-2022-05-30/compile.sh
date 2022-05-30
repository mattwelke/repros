#!/bin/env bash

protoc -I=. --js_out=import_style=commonjs,binary:. protos/message.proto
