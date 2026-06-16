SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.37.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.37.0;downloadfilename=golang-org-x-mod-0.37.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "91e8e4e9b74a8706dae808b66538d4ab22befd00c11f34134eb97ff572d52e85"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

