SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.38.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.38.0;downloadfilename=golang-org-x-mod-0.38.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "b19d1a19527f75bf148198b44be37784f7d7d22597b46e260bf22d1b320fe12c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

