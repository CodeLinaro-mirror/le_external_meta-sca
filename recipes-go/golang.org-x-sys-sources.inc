SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.48.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.48.0;downloadfilename=golang-org-x-sys-0.48.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "3a47e06431ba1e24d5b2aca3a7ce31fd13faff34df3e5d8e63f105ff9d0c1786"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

