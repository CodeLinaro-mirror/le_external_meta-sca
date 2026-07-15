SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.22.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.22.0;downloadfilename=golang-org-x-sync-0.22.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "4bc67d258ce7867cfc1a43765c43d98b4c49b90c46dd0b86f896a5a4909fade0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

