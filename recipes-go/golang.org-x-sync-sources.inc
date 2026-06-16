SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.21.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.21.0;downloadfilename=golang-org-x-sync-0.21.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "ee65459023de7f24836f6e2123144b5329bd0a4d05a87c3c448509378e2e6be7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

