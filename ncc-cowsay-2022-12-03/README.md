To repro:

```
npm i && npm run build && node index.js
```

Output:

```
<path>/dist/index.js:173
        return balloon[action](options.text || options._.join(" "), options.n ? null : options.W) + "\n" + cow(face);
                                                         ^

TypeError: Cannot read properties of undefined (reading 'join')
    at doIt (<path>/dist/index.js:173:51)
    at exports.say (<path>/dist/index.js:81:9)
    at <path>/dist/index.js:626:8
    at <path>/dist/index.js:628:3
    at Object.<anonymous> (<path>/dist/index.js:631:12)
    at Module._compile (node:internal/modules/cjs/loader:1159:14)
    at Module._extensions..js (node:internal/modules/cjs/loader:1213:10)
    at Module.load (node:internal/modules/cjs/loader:1037:32)
    at Module._load (node:internal/modules/cjs/loader:878:12)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:81:12)

Node.js v18.12.1
```

Env:

```
> node --version
v18.12.1
> npm --version
9.1.3
> lsb_release -a
No LSB modules are available.
Distributor ID: Ubuntu
Description:    Ubuntu 22.04.1 LTS
Release:        22.04
Codename:       jammy
```
